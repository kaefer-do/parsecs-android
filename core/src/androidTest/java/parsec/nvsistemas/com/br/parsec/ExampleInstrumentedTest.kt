package br.com.nvsistemas.parsec

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test que valida o packageName gerado para o APK de testes.
 * Para módulos library, o package usado nos testes normalmente é <namespace>.test
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        // Para módulo library o packageName esperado é namespace + ".test"
        assertEquals("br.com.nvsistemas.parsec.test", context.packageName)
    }
}
