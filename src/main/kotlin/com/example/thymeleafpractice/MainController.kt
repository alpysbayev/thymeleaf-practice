package com.example.thymeleafpractice

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MainController {

    @GetMapping("/")
    fun index(model: Model): String {

        model.addAttribute("name", "Adilet")

        model.addAttribute(
            "products",
            listOf(
                Product("apple", 400),
                Product("grape", 800),
                Product("watermelon", 150)
            )
        )

        return "index"
    }

}

data class Product(
    val name: String,
    val price: Int
)