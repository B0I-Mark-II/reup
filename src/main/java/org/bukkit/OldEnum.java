package org.bukkit;

import org.jetbrains.annotations.NotNull;

/**
 * Class which holds common methods which are present in an enum.
 * @param <T> the type of the old enum.
 * @deprecated only for backwards compatibility.
 */
@Deprecated
public abstract class OldEnum<T extends OldEnum<T>> implements Comparable<T> {
    /**
     * @param other to compare to.
     * @return negative if this old enum is lower, zero if equal and positive if higher than the given old enum.
     * @deprecated only for backwards compatibility, old enums can not be compared.
     */
    @Deprecated
    @Override
    public abstract int compareTo(@NotNull T other);

    /**
     * @return the name of the old enum.
     * @deprecated only for backwards compatibility.
     */
    @NotNull
    @Deprecated
    public abstract String name();

    /**
     * @return the ordinal of the old enum.
     * @deprecated only for backwards compatibility, it is not guaranteed that an old enum always has the same ordinal.
     */
    @Deprecated
    public abstract int ordinal();
}
