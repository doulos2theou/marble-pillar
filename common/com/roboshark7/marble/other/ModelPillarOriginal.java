package com.roboshark7.marble.other;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class ModelPillarOriginal extends ModelBase {

	//fields
	ModelRenderer Pillar;
	ModelRenderer Topcross;
	ModelRenderer Toppcross2;
	ModelRenderer Topcross3;
	ModelRenderer Topcross4;
	ModelRenderer Bottemcross;
	ModelRenderer Bottemcross2;
	ModelRenderer Bottemcross3;
	ModelRenderer Bottemcross4;

	public ModelPillarOriginal() {

		textureWidth = 40;
		textureHeight = 40;

		Pillar = new ModelRenderer(this, 24, 6);
		Pillar.addBox(1F, 0F, 0F, 4, 30, 4);
		Pillar.setRotationPoint(-3F, -8F, -2F);
		Pillar.setTextureSize(40, 40);
		Pillar.mirror = true;
		setRotation(Pillar, 0F, 0F, 0F);
		Topcross = new ModelRenderer(this, 0, 0);
		Topcross.addBox(0F, 1.2F, 0F, 4, 1, 8);
		Topcross.setRotationPoint(-2F, -8F, -4F);
		Topcross.setTextureSize(40, 40);
		Topcross.mirror = true;
		setRotation(Topcross, 0F, 0F, 0F);
		Toppcross2 = new ModelRenderer(this, 0, 0);
		Toppcross2.addBox(0F, 1.2F, 0F, 8, 1, 4);
		Toppcross2.setRotationPoint(-4F, -8F, -2F);
		Toppcross2.setTextureSize(40, 40);
		Toppcross2.mirror = true;
		setRotation(Toppcross2, 0F, 0F, 0F);
		Topcross3 = new ModelRenderer(this, 0, 0);
		Topcross3.addBox(0F, 1.2F, 0F, 6, 1, 10);
		Topcross3.setRotationPoint(-3F, -9F, -5F);
		Topcross3.setTextureSize(40, 40);
		Topcross3.mirror = true;
		setRotation(Topcross3, 0F, 0F, 0F);
		Topcross4 = new ModelRenderer(this, 0, 0);
		Topcross4.addBox(0F, 1.2F, 0F, 10, 1, 6);
		Topcross4.setRotationPoint(-5F, -8.933333F, -3F);
		Topcross4.setTextureSize(40, 40);
		Topcross4.mirror = true;
		setRotation(Topcross4, 0F, 0F, 0F);
		Bottemcross = new ModelRenderer(this, 0, 0);
		Bottemcross.addBox(0F, 0F, 0F, 4, 1, 8);
		Bottemcross.setRotationPoint(-2F, 22F, -4F);
		Bottemcross.setTextureSize(40, 40);
		Bottemcross.mirror = true;
		setRotation(Bottemcross, 0F, 0F, 0F);
		Bottemcross2 = new ModelRenderer(this, 0, 0);
		Bottemcross2.addBox(0F, 0F, 0F, 8, 1, 4);
		Bottemcross2.setRotationPoint(-4F, 22F, -2F);
		Bottemcross2.setTextureSize(40, 40);
		Bottemcross2.mirror = true;
		setRotation(Bottemcross2, 0F, 0F, 0F);
		Bottemcross3 = new ModelRenderer(this, 0, 0);
		Bottemcross3.addBox(0F, 0F, 0F, 6, 1, 10);
		Bottemcross3.setRotationPoint(-3F, 23.46667F, -5F);
		Bottemcross3.setTextureSize(40, 40);
		Bottemcross3.mirror = true;
		setRotation(Bottemcross3, 0F, 0F, 0F);
		Bottemcross4 = new ModelRenderer(this, 0, 0);
		Bottemcross4.addBox(0F, 0F, 0F, 10, 1, 6);
		Bottemcross4.setRotationPoint(-5F, 23F, -3F);
		Bottemcross4.setTextureSize(40, 40);
		Bottemcross4.mirror = true;
		setRotation(Bottemcross4, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		renderModel(f5);
//		Pillar.render(f5);
//		Topcross.render(f5);
//		Toppcross2.render(f5);
//		Topcross3.render(f5);
//		Topcross4.render(f5);
//		Bottemcross.render(f5);
//		Bottemcross2.render(f5);
//		Bottemcross3.render(f5);
//		Bottemcross4.render(f5);
	}
	
	public void renderModel(float f5) {
		Pillar.render(f5);
		Topcross.render(f5);
		Toppcross2.render(f5);
		Topcross3.render(f5);
		Topcross4.render(f5);
		Bottemcross.render(f5);
		Bottemcross2.render(f5);
		Bottemcross3.render(f5);
		Bottemcross4.render(f5);
	}

	/* THIS IS REALLY IMPORTANT. sorry for the caps or you would not have seen it.
	 * add public void renderModel (the part above) (with the names of your parts) 
	 * to your model. or else your block wont render. you can easily copy what you 
	 * need in here from the part above this one, in the public void render.
	 */

	private void setRotation(ModelRenderer model, float x, float y, float z) {
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
	}

}