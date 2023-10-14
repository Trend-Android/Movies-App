package com.softaai.mvvmdemo.di.moviesmodule

import com.example.moviesapp.domain.repos.MovieRepository
import com.softaai.mvvmdemo.domain.usecase.GetPopularMovies
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton



@Module
@InstallIn(SingletonComponent::class)
class MoviesUsecaseModule {

    @Provides
    @Singleton
    fun provideGetPopularMoviesUseCase(repository: MovieRepository): GetPopularMovies =
        GetPopularMovies(repository)
}