package com.github.nudelsuppe42.iplbte.services

import com.github.nudelsuppe42.iplbte.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
