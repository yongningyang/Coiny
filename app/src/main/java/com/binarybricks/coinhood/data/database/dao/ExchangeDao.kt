package com.binarybricks.coinhood.data.database.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import com.binarybricks.coinhood.data.database.entities.Exchange


/**
 * @author Pragya Agrawal on January 27, 2018
 *
 * Add queries to read/update exchange data from database.
 */
@Dao
interface ExchangeDao {

    @Query("select * from exchange")
    fun getAllExchanges(): List<Exchange>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertExchanges(list: List<Exchange>)
}
