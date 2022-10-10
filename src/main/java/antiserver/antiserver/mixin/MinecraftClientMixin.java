package antiserver.antiserver.mixin;

import antiserver.antiserver.client.AntiserverClient;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {

    @Inject(at = @At("HEAD"), method = "tick")
    public void onTick(CallbackInfo ci) {
        AntiserverClient.INSTANCE.onTick();
    }
}