package me.ryyvv.fumoku

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NamespaceTest {
    companion object {
        const val namespace = "me.ryyvv.fumoku"
    }

    @Test
    fun conventionNamespace() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        Assert.assertEquals(namespace, appContext.packageName)
    }
}