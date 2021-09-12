package com.example.ricknmorty.core.utils

inline fun <K, V> Iterable<Pair<K, V>>.forEachPair(action: (K, V) -> Unit) {
    for (element in this) action(element.first, element.second)
}
