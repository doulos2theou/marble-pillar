package com.roboshark7.marble.other;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPillarSquare extends ModelBase {

	//fields
	ModelRenderer Pillar;

	public ModelPillarSquare() {

//		textureWidth = 16;
//		textureHeight = 16;
		textureWidth = 64;
		textureHeight = 32;

		/**
		 *  // create new renderer with a texture
		 *  modelBase = new ModelRender (instance, texture offset X, texture offset Y)
		 *  // add a block
		 *  modelBase.addBox(offsetX, offsetY, offsetZ, sizeX, sizeY, sizeZ)
		 *  modelBase.setRotationPoint(offsetX, offsetY, offsetZ)
		 *  */
		Pillar = new ModelRenderer(this, 24, 6);
		Pillar.addBox(0F, 0F, 0F, 1, 2, 1); 
		Pillar.setRotationPoint(-0.5F, -0.5F, -0.5F);
		Pillar.setTextureSize(textureWidth, textureHeight);
		Pillar.mirror = true;
		setRotation(Pillar, 0F, 0F, 0F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		renderModel(f5);
	}
	
	public void renderModel(float f5) {
		Pillar.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
	}

}