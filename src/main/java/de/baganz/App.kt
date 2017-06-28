package de.baganz

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 * Created by baganz on 26.06.17.
 */


@SpringBootApplication
open class App{

}


fun main(args: Array<String>) {
    SpringApplication.run(App::class.java, *args)
}