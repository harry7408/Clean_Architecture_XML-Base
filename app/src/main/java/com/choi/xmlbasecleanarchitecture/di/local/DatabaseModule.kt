package com.choi.xmlbasecleanarchitecture.di.local

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    // Room DB, SQLite 등 활용할 때
    /**
     * EX)  @Provides
     *     @Singleton
     *     fun providesDataBase(@ApplicationContext appContext: Context): AppDatabase {
     *         return Room.databaseBuilder(appContext, AppDatabase::class.java, "abc.db")
     *             .fallbackToDestructiveMigration()
     *             .build()
     *     }
     */

}