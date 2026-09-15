package com.waxd.keyboard.extensions

import android.annotation.SuppressLint
import android.content.Context
import org.fossify.commons.models.RadioItem
import com.waxd.keyboard.R
import com.waxd.keyboard.helpers.LANGUAGE_ARABIC
import com.waxd.keyboard.helpers.LANGUAGE_BELARUSIAN_CYRL
import com.waxd.keyboard.helpers.LANGUAGE_BELARUSIAN_LATN
import com.waxd.keyboard.helpers.LANGUAGE_BENGALI
import com.waxd.keyboard.helpers.LANGUAGE_BULGARIAN
import com.waxd.keyboard.helpers.LANGUAGE_CENTRAL_KURDISH
import com.waxd.keyboard.helpers.LANGUAGE_CHUVASH
import com.waxd.keyboard.helpers.LANGUAGE_CZECH_QWERTY
import com.waxd.keyboard.helpers.LANGUAGE_CZECH_QWERTZ
import com.waxd.keyboard.helpers.LANGUAGE_DANISH
import com.waxd.keyboard.helpers.LANGUAGE_DUTCH
import com.waxd.keyboard.helpers.LANGUAGE_ENGLISH_ASSET
import com.waxd.keyboard.helpers.LANGUAGE_ENGLISH_COLEMAK
import com.waxd.keyboard.helpers.LANGUAGE_ENGLISH_COLEMAKDH
import com.waxd.keyboard.helpers.LANGUAGE_ENGLISH_DVORAK
import com.waxd.keyboard.helpers.LANGUAGE_ENGLISH_NIRO
import com.waxd.keyboard.helpers.LANGUAGE_ENGLISH_QWERTZ
import com.waxd.keyboard.helpers.LANGUAGE_ENGLISH_SOUL
import com.waxd.keyboard.helpers.LANGUAGE_ENGLISH_WORKMAN
import com.waxd.keyboard.helpers.LANGUAGE_ESPERANTO
import com.waxd.keyboard.helpers.LANGUAGE_FRENCH_AZERTY
import com.waxd.keyboard.helpers.LANGUAGE_FRENCH_BEPO
import com.waxd.keyboard.helpers.LANGUAGE_GERMAN
import com.waxd.keyboard.helpers.LANGUAGE_GERMAN_QWERTZ
import com.waxd.keyboard.helpers.LANGUAGE_GREEK
import com.waxd.keyboard.helpers.LANGUAGE_HEBREW
import com.waxd.keyboard.helpers.LANGUAGE_ITALIAN
import com.waxd.keyboard.helpers.LANGUAGE_KABYLE_AZERTY
import com.waxd.keyboard.helpers.LANGUAGE_LATVIAN
import com.waxd.keyboard.helpers.LANGUAGE_LITHUANIAN
import com.waxd.keyboard.helpers.LANGUAGE_NORWEGIAN
import com.waxd.keyboard.helpers.LANGUAGE_POLISH
import com.waxd.keyboard.helpers.LANGUAGE_PORTUGUESE
import com.waxd.keyboard.helpers.LANGUAGE_PORTUGUESE_HCESAR
import com.waxd.keyboard.helpers.LANGUAGE_ROMANIAN
import com.waxd.keyboard.helpers.LANGUAGE_RUSSIAN
import com.waxd.keyboard.helpers.LANGUAGE_SLOVENIAN
import com.waxd.keyboard.helpers.LANGUAGE_SPANISH
import com.waxd.keyboard.helpers.LANGUAGE_SWEDISH
import com.waxd.keyboard.helpers.LANGUAGE_TURKISH
import com.waxd.keyboard.helpers.LANGUAGE_TURKISH_Q
import com.waxd.keyboard.helpers.LANGUAGE_UKRAINIAN
import com.waxd.keyboard.helpers.LANGUAGE_VIETNAMESE_TELEX

fun Context.getSelectedLanguagesSorted(): List<Int> {
    return config.selectedLanguages
        .map { it to getKeyboardLanguageText(it) }
        .sortedBy { it.second }
        .map { it.first }
}

fun Context.getKeyboardLanguagesRadioItems(): ArrayList<RadioItem> {
    return getSelectedLanguagesSorted()
        .map { RadioItem(it, getKeyboardLanguageText(it)) }
        .toMutableList() as ArrayList<RadioItem>
}

@Suppress("CyclomaticComplexMethod")
fun Context.getKeyboardLanguageText(language: Int): String {
    return when (language) {
        LANGUAGE_ARABIC -> getString(R.string.translation_arabic)
        LANGUAGE_BELARUSIAN_CYRL -> "${getString(R.string.translation_belarusian)} (Cyrillic)"
        LANGUAGE_BELARUSIAN_LATN -> "${getString(R.string.translation_belarusian)} (Latin)"
        LANGUAGE_BENGALI -> getString(R.string.translation_bengali)
        LANGUAGE_BULGARIAN -> getString(R.string.translation_bulgarian)
        LANGUAGE_CENTRAL_KURDISH -> getString(R.string.translation_central_kurdish)
        LANGUAGE_CHUVASH -> getString(R.string.translation_chuvash)
        LANGUAGE_CZECH_QWERTY -> "${getString(R.string.translation_czech)} (QWERTY)"
        LANGUAGE_CZECH_QWERTZ -> "${getString(R.string.translation_czech)} (QWERTZ)"
        LANGUAGE_DANISH -> getString(R.string.translation_danish)
        LANGUAGE_DUTCH -> getString(R.string.translation_dutch)
        LANGUAGE_ENGLISH_ASSET -> "${getString(R.string.translation_english)} (Asset)"
        LANGUAGE_ENGLISH_COLEMAK -> "${getString(R.string.translation_english)} (Colemak)"
        LANGUAGE_ENGLISH_COLEMAKDH -> "${getString(R.string.translation_english)} (Colemak-DH)"
        LANGUAGE_ENGLISH_DVORAK -> "${getString(R.string.translation_english)} (DVORAK)"
        LANGUAGE_ENGLISH_NIRO -> "${getString(R.string.translation_english)} (Niro)"
        LANGUAGE_ENGLISH_QWERTZ -> "${getString(R.string.translation_english)} (QWERTZ)"
        LANGUAGE_ENGLISH_SOUL -> "${getString(R.string.translation_english)} (Soul)"
        LANGUAGE_ENGLISH_WORKMAN -> "${getString(R.string.translation_english)} (Workman)"
        LANGUAGE_ESPERANTO -> getString(R.string.translation_esperanto)
        LANGUAGE_FRENCH_AZERTY -> "${getString(R.string.translation_french)} (AZERTY)"
        LANGUAGE_FRENCH_BEPO -> "${getString(R.string.translation_french)} (BEPO)"
        LANGUAGE_GERMAN -> getString(R.string.translation_german)
        LANGUAGE_GERMAN_QWERTZ -> "${getString(R.string.translation_german)} (QWERTZ)"
        LANGUAGE_GREEK -> getString(R.string.translation_greek)
        LANGUAGE_HEBREW -> getString(R.string.translation_hebrew)
        LANGUAGE_ITALIAN -> getString(R.string.translation_italian)
        LANGUAGE_KABYLE_AZERTY -> "${getString(R.string.translation_kabyle)} (AZERTY)"
        LANGUAGE_LATVIAN -> getString(R.string.translation_latvian)
        LANGUAGE_LITHUANIAN -> getString(R.string.translation_lithuanian)
        LANGUAGE_NORWEGIAN -> getString(R.string.translation_norwegian)
        LANGUAGE_POLISH -> getString(R.string.translation_polish)
        LANGUAGE_PORTUGUESE -> getString(R.string.translation_portuguese)
        LANGUAGE_PORTUGUESE_HCESAR -> "${getString(R.string.translation_portuguese)} (HCESAR)"
        LANGUAGE_ROMANIAN -> getString(R.string.translation_romanian)
        LANGUAGE_RUSSIAN -> getString(R.string.translation_russian)
        LANGUAGE_SLOVENIAN -> getString(R.string.translation_slovenian)
        LANGUAGE_SPANISH -> getString(R.string.translation_spanish)
        LANGUAGE_SWEDISH -> getString(R.string.translation_swedish)
        LANGUAGE_TURKISH -> getString(R.string.translation_turkish)
        LANGUAGE_TURKISH_Q -> "${getString(R.string.translation_turkish)} (Q)"
        LANGUAGE_UKRAINIAN -> getString(R.string.translation_ukrainian)
        LANGUAGE_VIETNAMESE_TELEX -> "${getString(R.string.translation_vietnamese)} (Telex)"
        else -> "${getString(R.string.translation_english)} (QWERTY)"
    }
}
