package com.roboshark7.marble;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class ModelPillar extends ModelBase {

	private final ModelRenderer middle;
	private final ModelRenderer sliceA1;
	private final ModelRenderer sliceA2;
	private final ModelRenderer sliceB1;
	private final ModelRenderer sliceB2;
	private final ModelRenderer sliceC1;
	private final ModelRenderer sliceC2;
	private final ModelRenderer sliceD1;
	private final ModelRenderer sliceD2;
	
	public ModelPillar() {

		textureWidth = 16;
		textureHeight = 16;

		/**
		 *  // create new renderer with a texture
		 *  modelBase = new ModelRender (instance, texture offset X, texture offset Y)
		 *  // add a block
		 *  modelBase.addBox(offsetX, offsetY, offsetZ, sizeX, sizeY, sizeZ)
		 *  modelBase.setRotationPoint(offsetX, offsetY, offsetZ)
		 *  */
		middle = new ModelRenderer(this, 24, 6);
		middle.addBox(0F, 0F, 0F, 6, 16, 16);
		middle.setRotationPoint(-3F, 8F, -8F);
		middle.setTextureSize(textureWidth, textureHeight);
		middle.mirror = true;
		setRotation(middle, 0F, 0F, 0F);
		sliceA1 = new ModelRenderer(this, 24, 6);
		sliceA1.addBox(0F, 0F, 0F, 2, 16, 14);
		sliceA1.setRotationPoint(-5F, 8F, -7F);
		sliceA1.setTextureSize(textureWidth, textureHeight);
		sliceA1.mirror = true;
		setRotation(sliceA1, 0F, 0F, 0F);
		sliceA2 = new ModelRenderer(this, 24, 6);
		sliceA2.addBox(0F, 0F, 0F, 2, 16, 14);
		sliceA2.setRotationPoint(3F, 8F, -7F);
		sliceA2.setTextureSize(textureWidth, textureHeight);
		sliceA2.mirror = true;
		setRotation(sliceA2, 0F, 0F, 0F);
		sliceB1 = new ModelRenderer(this, 24, 6);
		sliceB1.addBox(0F, 0F, 0F, 1, 16, 12);
		sliceB1.setRotationPoint(-6F, 8F, -6F);
		sliceB1.setTextureSize(textureWidth, textureHeight);
		sliceB1.mirror = true;
		setRotation(sliceB1, 0F, 0F, 0F);
		sliceB2 = new ModelRenderer(this, 24, 6);
		sliceB2.addBox(0F, 0F, 0F, 1, 16, 12);
		sliceB2.setRotationPoint(5F, 8F, -6F);
		sliceB2.setTextureSize(textureWidth, textureHeight);
		sliceB2.mirror = true;
		setRotation(sliceB2, 0F, 0F, 0F);
		sliceC1 = new ModelRenderer(this, 24, 6);
		sliceC1.addBox(0F, 0F, 0F, 1, 16, 10);
		sliceC1.setRotationPoint(-7F, 8F, -5F);
		sliceC1.setTextureSize(textureWidth, textureHeight);
		sliceC1.mirror = true;
		setRotation(sliceC1, 0F, 0F, 0F);
		sliceC2 = new ModelRenderer(this, 24, 6);
		sliceC2.addBox(0F, 0F, 0F, 1, 16, 10);
		sliceC2.setRotationPoint(6F, 8F, -5F);
		sliceC2.setTextureSize(textureWidth, textureHeight);
		sliceC2.mirror = true;
		setRotation(sliceC1, 0F, 0F, 0F);
		sliceD1 = new ModelRenderer(this, 24, 6);
		sliceD1.addBox(0F, 0F, 0F, 1, 16, 6);
		sliceD1.setRotationPoint(-8F, 8F, -3F);
		sliceD1.setTextureSize(textureWidth, textureHeight);
		sliceD1.mirror = true;
		setRotation(sliceD1, 0F, 0F, 0F);
		sliceD2 = new ModelRenderer(this, 24, 6);
		sliceD2.addBox(0F, 0F, 0F, 1, 16, 6);
		sliceD2.setRotationPoint(7F, 8F, -3F);
		sliceD2.setTextureSize(textureWidth, textureHeight);
		sliceD2.mirror = true;
		setRotation(sliceD2, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		renderModel(f5);
	}
	
	public void renderModel(float f5) {
		middle.render(f5);
		sliceA1.render(f5);
		sliceA2.render(f5);
		sliceB1.render(f5);
		sliceB2.render(f5);
		sliceC1.render(f5);
		sliceC2.render(f5);
		sliceD1.render(f5);
		sliceD2.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
	}

}