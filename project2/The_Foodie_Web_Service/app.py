"""
@author: Leonardo Roman 11/17/2018
RESTful api that performs sequential API calls to two RESTful servers.
This python application performs GET respose by accepting an address string
as parameter and uses it to perform a GET call to Geocode.io API in order
to get the coordinates of given address. After getting such coordinates,
another API call is perform to Zomato.io API in order to get the 20th nearest
restaurants around. The data obtained from Zomato is then cleaned up and
return back to the user in the original GET request to this application.
"""
from flask import Flask, request, Response, json
from geocodio import GeocodioClient
from pyzomato import Pyzomato
# from pyspark import SparkContext

# GIOCODE API KEY:
geocode_client = GeocodioClient('API KEY')
# ZOMATO API KEY:
zomato_client = Pyzomato('API KEY')
app = Flask(__name__)

@app.route("/restaurant")
def start():
    data = {'route'  : 'restaurant','echo' : 'GET'}
    js = json.dumps(data)
    resp = Response(js, status=200, mimetype='application/json')
    resp.headers['Link'] = 'http://luisrei.com'
    return resp

@app.route("/restaurant/<address>", methods = ['GET'])
def get_address(address):
    #if address == None:

    # API call: Geocode the address
    geocoded_response = geocode_client.geocode(address)
    # get the coordinates:
    coor = geocoded_response.coords
    # API call: rest call to ZOMATO returns a dictionary:
    zomato_response = zomato_client.search(lat=coor[0],lon=coor[1])
    # get address, name, cuisines and ratings from zomato_response:
    js = getRestaurants(zomato_response)
    # Convert to Json format response
    restaurants = Response(js, status=200, mimetype='application/json')
    return restaurants

def getRestaurants(dictionary):
    restaurants = {}
    dic = {}
    list = []
    for restaurant in dictionary['restaurants']:
        restaurants['name'] = restaurant['restaurant']['name']
        restaurants['address'] = restaurant['restaurant']['location']['address']
        restaurants['cuisines'] = restaurant['restaurant']['cuisines']
        restaurants['rating'] = restaurant['restaurant']['user_rating']['aggregate_rating']
        list.append(restaurants)
        restaurants = {}
    # convert dictionary to string and return it
    dic['restaurants'] = list
    restaurants_json = json.dumps(dic)
    return restaurants_json

if __name__ == '__main__':
    app.run(debug = True)
