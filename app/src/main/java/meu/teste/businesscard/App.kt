package meu.teste.businesscard

import android.app.Application
import com.google.android.datatransport.runtime.dagger.Lazy
import meu.teste.businesscard.data.AppDatabase
import meu.teste.businesscard.data.BusinessCardRepository

class App : Application(){
    val database by Lazy {AppDatabase.getDatabase(this) }
    val repository by Lazy { BusinessCardRepository(database.businessDao()) }
}