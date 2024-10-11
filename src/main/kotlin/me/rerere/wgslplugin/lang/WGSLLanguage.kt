package me.rerere.wgslplugin.lang

import com.intellij.lang.Language
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.openapi.util.IconLoader


object WGSLLanguage : Language("WGSL")

object WGSLIcons {
    val FILE = IconLoader.getIcon("/icons/wgsl.png", WGSLIcons::class.java);
}

object WGSLLanguageFileType : LanguageFileType(WGSLLanguage) {
    override fun getName(): String = "WGSL"
    override fun getDescription(): String = "WebGPU Shading Language"
    override fun getDefaultExtension(): String = "wgsl"
    override fun getIcon() = WGSLIcons.FILE
}