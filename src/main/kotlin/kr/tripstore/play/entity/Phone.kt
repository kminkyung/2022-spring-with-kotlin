package kr.tripstore.play.entity

import javax.persistence.*


@Entity(name = "Phone")
class Phone(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private val id: Long = 0L,

        @Column(name = "number")
        private val number: String,

        @ManyToOne
        @JoinColumn(name = "person_id", foreignKey = ForeignKey(name = "PERSON_ID_FK"))
        private val person: Person? = null
)