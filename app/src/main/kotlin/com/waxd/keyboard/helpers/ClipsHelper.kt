package com.waxd.keyboard.helpers

import android.content.Context
import com.waxd.keyboard.extensions.clipsDB
import com.waxd.keyboard.models.Clip

class ClipsHelper(val context: Context) {

    // make sure clips have unique values
    fun insertClip(clip: Clip): Long {
        return if (context.clipsDB.getClipWithValue(clip.value) == null) {
            context.clipsDB.insertOrUpdate(clip)
        } else {
            -1
        }
    }
}
