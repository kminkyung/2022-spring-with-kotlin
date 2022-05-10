package kr.tripstore.play.repository

import kr.tripstore.play.entity.Person
import kr.tripstore.play.entity.Phone
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.test.context.ActiveProfiles

@ActiveProfiles("test")
@DataJpaTest
class PhoneRepositoryTest @Autowired constructor(
        private val entityManager: TestEntityManager,
        private val personRepository: PersonRepository,
        private val phoneRepository: PhoneRepository
) {

    @Test
    fun save() {
        val person = personRepository.save(
                Person(
                        name = "kmk"
                )
        )

        val phone = phoneRepository.save(
                Phone(
                        number = "010-1234-5678",
                        person = person
                        )
        )

        entityManager.flush()
        entityManager.clear()
    }
}