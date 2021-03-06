package com.leonardo.roman
import org.apache.spark.internal._
import org.apache.log4j.{Level, Logger}
import org.apache.spark.internal.Logging

object StreamingExamples extends Logging {
	def setStreamingLogLevels(){
		val log = Logger.getRootLogger.getAllAppenders.hasMoreElements
				if (!log) {
					// We first log something to initialize Spark's default logging, then we override the
					// logging level.
					logInfo("Setting log level to [WARN] for streaming example." +
							" To override add a custom log4j.properties to the classpath.")
					Logger.getRootLogger.setLevel(Level.WARN)
				}
	}
}