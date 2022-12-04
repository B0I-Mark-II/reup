package org.bukkit;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import org.bukkit.support.AbstractTestingBase;
import org.junit.Test;

public class MaterialTest extends AbstractTestingBase {

    @Test
    public void getByNameNull() {
        assertThat(Material.getMaterial(null), is(nullValue()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void matchMaterialByNull() {
        Material.matchMaterial(null);
    }
}
