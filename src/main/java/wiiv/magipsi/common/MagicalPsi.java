package wiiv.magipsi.common;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import wiiv.magipsi.common.lib.LibMisc;

@Mod(modid = LibMisc.MOD_ID, name = LibMisc.MOD_NAME, version = LibMisc.VERSION, dependencies = LibMisc.DEPENDENCIES)
public class MagicalPsi {
	
	@Instance(LibMisc.MOD_ID)
	public static MagicalPsi instance;

}