package io.github.nornslab.norns.examples.spark

import io.github.nornslab.norns.core.NornsJob
import io.github.nornslab.norns.core.api.TaskContext
import io.github.nornslab.norns.spark.{SJC, SparkTask, SparkTaskJob}

/**
  * @author Li.Wei by 2019/8/30
  */
object SparkRefPluginTaskExample {
  def main(args: Array[String]): Unit = {
    System.setProperty("norns.job.config",
      ClassLoader.getSystemResource("spark/SparkRefPluginTaskExample.conf").getPath)

    NornsJob.work(classOf[SparkTaskJob])
  }
}

class NewUser(implicit override val jc: SJC,
              implicit override val tc: TaskContext) extends SparkTask {
  override def start(): Unit = {
    info(s"$name running...")
  }
}

class NewRole(implicit override val jc: SJC,
              implicit override val tc: TaskContext) extends SparkTask {
  override def start(): Unit = {
    info(s"$name running...")
  }
}