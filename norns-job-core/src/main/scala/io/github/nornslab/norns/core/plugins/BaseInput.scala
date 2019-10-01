package io.github.nornslab.norns.core.plugins

import io.github.nornslab.norns.core.api._

/**
  * @author Li.Wei by 2019/9/19
  */
abstract class BaseInput[JC <: JobContext, PLUG_EVENT](implicit override val pluginConfig: Configuration,
                                                       implicit override val jc: JC,
                                                       implicit override val tc: TaskContext)
  extends BaseTaskPlugin[JC] with Input[PLUG_EVENT] with LifecycleAware