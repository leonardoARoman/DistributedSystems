0. RUN HADOOP NODES:
	>> start-all.sh
1. COMPILE THE JAVA FILES (runs all files in src folder, hadoop classpath ensures hadoop libraries can be access by java application, -d build so all class files get saved in build folder):
  >> cd reddit_analys
  >> javac -cp $(hadoop classpath) -d build src/*
2. CREATE A JAR FILE FOR EVERY NEW JOB:
	>> jar cvf RedditSmallData.jar -C build .
3. CREATE AN INPUT DIRECTORY IN THE HADOOP DIRECTORY AND PASS THE TEXT FILE TO BE USED:
	>> hdfs dfs -mkdir -p /reddit-data/input
	>> hdfs dfs -ls /
	>> hdfs dfs -put '/home/hduser/Desktop/java_projects/reddit_analys/reddit_data/reddit-data-small.txt' /reddit-data/input
	>> hdfs dfs -ls /reddit-data/input
4. START THE CLUSTER AND GET OUTPUT:
	>> hadoop jar RedditSmallData.jar MapReduce /word-count/input /reddit-data/output/smallCount
	>> hdfs dfs -ls /reddit-data/output
	>> hdfs dfs -cat /reddit-data/output/smallCount/part-r-00000
5. To copy a file from Hadop File System to your local File System
        >> hdfs dfs -copyToLocal '/reddit-data/output/RedditSmallSum' /home/hduser/Desktop/java_projects/reddit_analy/output/
