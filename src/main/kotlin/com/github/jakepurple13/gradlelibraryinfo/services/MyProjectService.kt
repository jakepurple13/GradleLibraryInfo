package com.github.jakepurple13.gradlelibraryinfo.services

import com.github.jakepurple13.gradlelibraryinfo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
