package meu.teste.businesscard.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface BusinessCardDao {

    @Query("SELECT * FROM BusinessCard") // @Query mapeia (BusionessCard) a Entity como uma tabela // Seleciona o conteúdo de BusinessCard (Entity)
    fun getAll(): LiveData<List<BusinessCard>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(businessCard: BusinessCard)

}