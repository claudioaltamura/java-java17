package de.claudioaltamura.java.java17.sealed.classes;

/**
 * The permits clause defines, if any extends are allowed.
 */
abstract sealed class Gender permits Male, Female {}