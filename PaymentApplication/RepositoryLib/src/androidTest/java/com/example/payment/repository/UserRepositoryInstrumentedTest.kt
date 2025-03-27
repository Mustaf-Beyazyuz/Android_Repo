package com.example.payment.repository

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.payment.repository.entity.User
import com.example.payment.repository.global.USER_FILE

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import org.junit.Ignore
import java.io.File
import java.time.LocalDate
import java.time.Month

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
//@Ignore("bu testi geçmek için kullanılır")
class UserRepositoryInstrumentedTest {

    companion object
    {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        val userRepository = UserRepository(appContext)
    }

    @Before
    fun setUp()
    {
        val file = File(appContext.filesDir, USER_FILE)
        if(file.exists() && file.length()>0L)
            return
        val user1 = User("mustafa","mustafa1234","Mustafa","Beyazyüz", LocalDate.of(1998, Month.JUNE,8),LocalDate.now())
        val user2 = User("talha","talha1234","Talha","Beyazyüz", LocalDate.of(2000, Month.OCTOBER,13),LocalDate.now())
        userRepository.save(user1)
        userRepository.save(user2)

    }
    @Test
    fun save_and_findByUserNameAndPasswordSuccsessTest() {

        assertNotNull(userRepository.findByUserNameAndPassword("mustafa","mustafa1234"))
    }

    @Test
    fun save_and_findByUserNameAndPasswordPasswordFailTest() {

        assertNull(userRepository.findByUserNameAndPassword("talha","ali123"))
    }
    @Test
    fun save_and_findByUserNameAndPasswordUserNameFailTest() {

        assertNull(userRepository.findByUserNameAndPassword("mahmut","talha1234"))
    }

    @Test
    fun save_and_findByUserNameAndPasswordBothFailTest() {

        assertNull(userRepository.findByUserNameAndPassword("mahmut","mahmut"))
    }


}