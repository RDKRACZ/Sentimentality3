package website.skylorbeck.sentimentality3.sentimentality3;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.SmokerScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;

public class ExtraSmokerBlockEntity extends AbstractExtraFurnaceBlockEntity {//copy of vanilla
    public ExtraSmokerBlockEntity(BlockPos pos, BlockState state) {
        super(Declarer.EXTRA_SMOKER_FURNACE_ENTITY,pos,state, RecipeType.SMOKING);
    }

    @Override
    public Text getContainerName() {
        return new TranslatableText("container.smoker");
    }

    protected int getFuelTime(ItemStack fuel) {
        return super.getFuelTime(fuel) / 2;
    }

    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new SmokerScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}
