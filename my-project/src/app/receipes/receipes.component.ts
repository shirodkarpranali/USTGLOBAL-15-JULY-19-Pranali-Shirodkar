import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-receipes',
  templateUrl: './receipes.component.html',
  styleUrls: ['./receipes.component.css']
})
export class ReceipesComponent implements OnInit {
  receipesData:any='';
  receipes=([
    {
      name:'Puran poli',
      img:"https://www.yourhungerstop.com/wp-content/uploads/2015/03/PuranPoli.jpg ",
      description:'Puran poli is an Indian stuffed bread recipe where puran is stuffing and poli is known as roti(Indian bread) made with wheat flour. Roti is stuffed with sweet dal. I have featured this recipe from spiceupthecurry.com '
      },
      {
        name:'Shrikhand',
        img:"https://i2.wp.com/flavouroma.com/wp-content/uploads/2017/09/shrikhand-recipeHP.jpg?fit=840%2C560&ssl=1",
        description:' Dried up plus fresh fruit like mango pulp are involved to add taste and extra ingredients like cardamom powder, sugar, plus saffron are used.Hung curd is the main ingredient of the recipe. Here is how to make it.Use the hung curd and to it, add saffron mixture. The saffron mixture is made using milk. To the two spoons of milk, add little saffron or kesar.To the hung curd, add the saffron mixture. Add sugar and mix well.Whip the mix till you get a cream like consistency.Garnish with nuts.'
      },
      {
        name:'Misal Pav',
        img:"https://i.ytimg.com/vi/sk9LvFuEw_0/maxresdefault.jpg",
        description:'Cook the sprouts in pressure cooker along with potato, salt and turmeric. But before, wash the sprouts well in running water.Pressure cook it for 3 whistles. Meanwhile, take a gems sized tamrind pulp and soak it in water to make a paste.Heat oil in a pan and add mustard seeds. Let it crackle. Now add the jeera or cumin seeds. Now, add finely chopped onions, When the color turns translucent, add ginger garlic paste and 2 small green chilies.Stir well and wait till the aroma of ginger garlic fades. Now add the spices to it. Mix well and add the tamrind water or paste.Simmer till the smell of turmeric goes away.Strain the sprouts and add to the pan. Season with some salt. Add some sugar if you like.Simmer it.Plate it with coriander leaves, tomato (optional) and finely chopped onions. Garnish them on top.Squeeze some lemon and use the bread slices to dip and eat!'
      },
      { 
        name:'Sabudana Khichdi',
        img:"https://www.vegrecipesofindia.com/wp-content/uploads/2013/10/sabudana-khichdi.jpg",
        description:'Begin by heating oil in a pan. To this, add jeera or cumin seeds, peanuts. Let the peanuts roast for a while.Meanwhile, wash the sabudana well in running water. Remember to soak it for 3-5 hours.Now, add the potato to the pan and let it cook. Once the potato becomes soft, add the sabudana and the grated coconut.Sprinkle some water and squeeze a few drops of lemon.Garnish with coriander leaves.Serve hot!'
      },
      {
       name:'Sol-Kadhi',
       img:"https://5.imimg.com/data5/TT/LY/MY-6370630/sol-kadhi-500x500.jpg",
       description:' Dilute the curd with adequate water.To this add salt, hing and hurry leaves.Mix it very well. Finally add the channa dal powder.Sol Kadhi is known to be the best thirst quencher.'
      },
      { 
        name:'Batata Vada',
        img:"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTD3Y3dvepvki6iTMP3yrAMq3niMeX625I0zVqSQYHEx8ZYeP0r",
        description:'Smash the potatoes after pressure cooking them. Peel their skin.To this, add salt, chili powder and turmeric. You can also add some hing to get the flavor.Make the besan batter by mixing besan and water together. Get a dosa like batter.Make potato balls and dip them in the besan batter.Deep fry them in oil.Serve them hot with green chutney or fried salty chilies.The Marathi foods are usually tangy and come in mild flavors. The famous missal pav and vada pav are rightfully theirs and is a very popular tea time snack. Most of their dishes however are light on the stomach and at the same time, exceptionally tasty. Start trying them today and make your breakfast and tea time more interesting. '
      },
      { 
        name:'Chivda Pohey',
        img:"https://i.ytimg.com/vi/OHnYVU_yzK0/hqdefault.jpg",
        description:' In a pan, add the spoon of oil and to it add mustard seeds. After it crackles, add the peanuts and let them brown.Now, add onions, and kept hem on flame till they turn pink. Add salt, turmeric powder and red chili powder.Mix well. Meanwhile, wash the flattened rice in running water, once. Do not over wash it, else it may turn mushy.Add the strained rice to the pan. Mix well and allow it be on simmer for two minutes.Switch off the flame and plate it. Garnish with sev (optional), cashews and coriander leaves.Pohey is usually preferred because it is low on carbs and is a typically light breakfast. It keeps you full in a comfortable way.'
      },
      {
        name:'Pav-Bhaji',
        img:"https://zaykarecipes.com/wp-content/uploads/2017/02/Pav-Bhaji-Recipe.jpg",
        description:'Maharashtrian cuisines has an unending list of wildly flavored food, which will leave you mesmerized even after several hours of eating it. From popular street foods to immensely delicious local Marathi food, you will love all '
      },
      {
        name:'pithale',
        img:"https://i.ytimg.com/vi/IYMM9YyJtiw/maxresdefault.jpg",
        description:'It’s a rural Marathi dish. Whenever you are tired and want to eat some healthy food, this is the quickest and fastest dish to make. You can make pithale dry or as like curry but I curry version. It goes well with rice as well as roti. Pithale is one of my comfort food I can eat this pithale anytime.'
       },
      {
        name:'chirote',
        img:"https://d3j4nopn8wm92b.cloudfront.net/sites/default/files/styles/recipe_main/public/SWEET%20PURI.jpg?itok=Ll7ogbVl ",
        description:'Chirote is crusty sweet snack recipe. These are delectable and appetizing. This Maharashtrian recipe can be prepared for any special occasion or festival '
      }

  ])
  constructor() { }
  sendReceipes(receipe){
  this.receipesData = receipe;
  }

  ngOnInit() {
  }

}
