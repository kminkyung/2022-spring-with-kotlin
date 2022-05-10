package kr.tripstore.play.repository

import kr.tripstore.play.entity.Person
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.test.context.ActiveProfiles

@ActiveProfiles("test")
@DataJpaTest
class PersonRepositoryTest @Autowired constructor(
        private val entityManager: TestEntityManager,
        private val personRepository: PersonRepository
) {

    @Test
    fun save() {
        personRepository.save(
                Person(
                        name = "kmk"
                )
        )

        entityManager.flush()
        entityManager.clear()
    }

    @Test
    fun find() {
        val person = personRepository.save(
                Person(
                        name = "kmk"
                )
        )

        entityManager.flush()
        entityManager.clear()

        val findAll = personRepository.findAll()
        println(findAll)

        val findPerson = personRepository.getById(person.id)
        println(findPerson)

        assertThat(findPerson.id).isEqualTo(person.id)
        assertThat(findPerson.name).isEqualTo(person.name)
    }
}