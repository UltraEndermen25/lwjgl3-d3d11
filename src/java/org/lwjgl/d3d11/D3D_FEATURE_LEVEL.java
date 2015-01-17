package org.lwjgl.d3d11;

public enum D3D_FEATURE_LEVEL {

    D3D_FEATURE_LEVEL_9_1(0x9100),
    D3D_FEATURE_LEVEL_9_2(0x9200),
    D3D_FEATURE_LEVEL_9_3(0x9300),
    D3D_FEATURE_LEVEL_10_0(0xa000),
    D3D_FEATURE_LEVEL_10_1(0xa100),
    D3D_FEATURE_LEVEL_11_0(0xb000),
    D3D_FEATURE_LEVEL_11_1(0xb100);

    public final int value;

    D3D_FEATURE_LEVEL(int value) {
        this.value = value;
    }

    public static D3D_FEATURE_LEVEL byValue(int val) {
        for (D3D_FEATURE_LEVEL f : values()) {
            if (f.value == val) {
                return f;
            }
        }
        return null;
    }

}
