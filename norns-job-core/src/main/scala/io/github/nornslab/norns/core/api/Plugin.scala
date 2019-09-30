package io.github.nornslab.norns.core.api

/** 任务插件
  *
  * @author Li.Wei by 2019/9/2
  */
trait Plugin {

  /** 插件配置模式 */
  def configSchema: Seq[PluginConfigSpec[_]]

}
