package me.rerere.wgslplugin.psi

import com.intellij.psi.tree.IElementType
import me.rerere.wgslplugin.lang.WGSLLanguage
import org.jetbrains.annotations.NonNls

class WGSLTokenType(debugName: @NonNls String) : IElementType(debugName, WGSLLanguage)

class WGSLElementType(debugName: String) : IElementType(debugName, WGSLLanguage)