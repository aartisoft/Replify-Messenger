/*
 * Copyright (C) 2017 Moez Bhatti <innovate.bhatti@gmail.com>
 *
 * This file is part of replify.
 *
 * replify is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * replify is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with replify.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.innovate.replify.feature.gallery

import android.content.Intent
import androidx.lifecycle.ViewModel
import com.innovate.replify.injection.ViewModelKey
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import javax.inject.Named

@Module
class GalleryActivityModule {

    @Provides
    fun provideIntent(activity: GalleryActivity): Intent = activity.intent

    @Provides
    @Named("partId")
    fun providePartId(activity: GalleryActivity): Long = activity.partId

    @Provides
    @IntoMap
    @ViewModelKey(GalleryViewModel::class)
    fun provideGalleryViewModel(viewModel: GalleryViewModel): ViewModel = viewModel

}