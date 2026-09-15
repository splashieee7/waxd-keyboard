package com.waxd.keyboard

import android.app.Application
import androidx.emoji2.bundled.BundledEmojiCompatConfig
import androidx.emoji2.text.EmojiCompat
import org.fossify.commons.extensions.checkUseEnglish
import com.waxd.keyboard.extensions.isDeviceInDirectBootMode
import com.waxd.keyboard.helpers.Config

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Config.newInstance(this).applyWaxdThemeDefaultsIfNeeded()
        if (!isDeviceInDirectBootMode) {
            checkUseEnglish()
        }
        setupEmojiCompat()
    }

    private fun setupEmojiCompat() {
        val config = BundledEmojiCompatConfig(this)
        EmojiCompat.init(config)
    }
}
