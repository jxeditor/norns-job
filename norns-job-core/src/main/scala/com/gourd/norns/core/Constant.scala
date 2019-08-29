package com.gourd.norns.core

import java.io.File

import com.typesafe.config.ConfigFactory.{empty, parseFile, parseResources}
import com.typesafe.config.{Config, ConfigRenderOptions}

/** Job 常量
  *
  * @author Li.Wei by 2019/8/29
  */
object Constant {
  val norns = "norns"
  val renderOptions = ConfigRenderOptions.defaults
    .setComments(false).setOriginComments(false).setFormatted(true).setJson(true)

  val loadConfFile: Function[(Option[Config], String), Config] = {
    case (None, filePath) => parseResources(filePath)
    case (Some(c), filePathConfigKey) if c.hasPathOrNull(filePathConfigKey) =>
      parseFile(new File(c.getString(filePathConfigKey)))
    case _ => empty()
  }
}
