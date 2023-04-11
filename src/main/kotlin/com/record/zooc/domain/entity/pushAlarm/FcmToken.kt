package com.record.zooc.domain.entity.pushAlarm

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "fcmtoken")
class FcmToken(
    userId: Long,
    fcmToken: String,
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = 0
        protected set

    @Column(name = "fcm_token")
    var fcmToken: String = fcmToken
        protected set
}