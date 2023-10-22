package com.example.dagger

import com.example.dagger2.EmailService

class UserRegistrationService(private val userRepository: UserRepository,
                              private val emailService: EmailService
) {

    fun register(email: String, password: String) {
        userRepository.saveuser(email, password)
        emailService.send(
            to = email,
            "rishabh9aug@gmail.com", "Hakuna matata", "This is a test email"
        )
    }
}
