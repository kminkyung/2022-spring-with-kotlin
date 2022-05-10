package kr.tripstore.play.repository

import kr.tripstore.play.entity.Phone
import org.springframework.data.jpa.repository.JpaRepository

interface PhoneRepository: JpaRepository<Phone, Long>