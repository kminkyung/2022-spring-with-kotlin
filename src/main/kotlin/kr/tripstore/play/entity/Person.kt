package kr.tripstore.play.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "Person")
class Person(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0L,

        val name: String
) {
        override fun toString(): String {
                return "Person(id=$id, name='$name')"
        }
}