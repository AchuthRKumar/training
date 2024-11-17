
import { Prop, Schema, SchemaFactory } from '@nestjs/mongoose';
import { HydratedDocument } from 'mongoose';

export type CatDocument = HydratedDocument<Restaurant>;

@Schema()
export class Restaurant {
  @Prop()
  Item: string;

  @Prop()
  Price: number;

}

export const RestaurantSchema = SchemaFactory.createForClass(Restaurant);
