package de.baganz.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by baganz on 26.06.17.
 */


@RestController
open class MyRestController{

    @RequestMapping("/hello")
    fun greeting() : String {
        return "Hello World"
    }
    


}