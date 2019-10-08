import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-newss',
  templateUrl: './newss.component.html',
  styleUrls: ['./newss.component.css']
})
export class NewssComponent implements OnInit {

  newsData: any='';

  news=[
    { headline:'Sushma Swaraj: Leader who broke records, won hearts and inspired minds | An interactive timeline',
    img:'https://akm-img-a-in.tosshub.com/indiatoday/images/story/201908/RTR3VVUE_770X433-770x433.jpeg?rRxCvngoDmqQG8CtGJI2sZSk_42Mr5NO',
    description:'Sushma Swarajs last tweet at 7.23 pm on August 6 said it all - a lifelong wish finally fulfilled. Her dream was to see the end of Article 370 of the Indian Constitution that accorded special status to Jammu and Kashmir. She and her party had dreamt and advocated this for long'},

  {
    headline:'PM Modi likely to address nation on Article 370 move on Thursday',
    img:'https://akm-img-a-in.tosshub.com/indiatoday/images/story/201908/modi-pib-770x433.png?FGUjCrI8iyPFHTxrKiTbRnxzfUnYLO0o',
    description:'Prime Minister Narendra Modi is likely to address the nation on Thursday during which he is expected to explain governments decisions on abrogating special status to Jammu and Kashmir and splitting the state into two union territories, sources have said.'},
  
    { headline:'Maharashtra floods: Situation worsens as all dams at full capacity, deluge leaves 16 dead',
    img:'https://akm-img-a-in.tosshub.com/indiatoday/images/story/201908/pune_ETciLxP-770x433.jpeg?6U6w06YR7.NbbZqeiJ393_k3jiTEKSXt',
    description:'Over 1.32 lakh people have been shifted to safer places in Western Maharashtra with the flood situation remaining especially grim in Kolhapur and Sangli districts on Wednesday following incessant rains.'},
  {
    headline:'Mamata Banerjee unveils statue of Karunanidhi on his first death anniversary',
  img:'https://akm-img-a-in.tosshub.com/indiatoday/images/story/201908/fa-770x433.png?rtGOdGsItrlSBbbZhE6CLNqatma0RSVw',
  description:'West Bengal Chief Minister Mamata Banerjee on Wednesday unveiled a statue of former Tamil Nadu Chief Minister M Karunanidhi in Kodambakkam here on Wednesday on his first death anniversary. '
  },
  {
    headline:'Pakistan minister demands to cut off diplomatic ties with India, says choice is between dishonour and war',
    img:'https://akm-img-a-in.tosshub.com/indiatoday/images/story/201908/fawad-770x433.png?KTaS.DJvqpPUju51.QVBqjQLZWNa9u7f',
    description:'Pakistan should cut off its diplomatic ties with India, Science and Technology Minister Fawad Chaudhry said on Wednesday after the Indian government revoked Article 370 which gave special status to Jammu and Kashmir.'
    },
    {
      headline:'Rajya Sabha passes 31 bills in 35 sittings, clocks 105% productivity',
      img:'https://akm-img-a-in.tosshub.com/indiatoday/images/story/201908/parlia-770x433-770x433.jpeg?JzGl3Ep6LiioJkWCbo0G0S.zZngaG6Sw',
      description:'The Rajya Sabha passed 31 bills in the budget session that ended on Wednesday as against 33 bills during the last five sessions, clocking 105 per cent productivity'
      },
      {
        headline:'Devendra Fadnavis cancels Yatra for the day in Sushmas honour',
        img:'https://akm-img-a-in.tosshub.com/indiatoday/images/story/201908/devendra-fadnavis_story_647_12-770x433.jpeg?Gjbrg_2fYvvtnipqehHHJW3P7Aa_fZXU',
        description:'The Maharashtra Chief Minister Devendra Fadnavis cancelled all his Maha Janadesh Yatra programmes for the day as a mark of respect for Sushma Swaraj.'
        },
        {
          headline:'Ashes 2019: Steve Smith showed kind of mental strength he has, says Glenn McGrath',
          img:'https://akm-img-a-in.tosshub.com/indiatoday/images/story/201908/2019-08-04T142937Z_2055841625__0-770x433.png?VFuoCW2jg0XNWJ1cX2W_he.FiyF9xedm',
          description:'Steve Smiths twin hundreds in the opening Ashes Test was an example of what mental fortitude means after having gone through an extremely rough phase, Australian pace legend Glenn McGrath said on Wednesday.'
          },
          {
            headline:'GT20 Canada: Yuvraj Singh-led Toronto Nationals vs Montreal Tigers start delayed due to payment issue',
            img:'https://akm-img-a-in.tosshub.com/indiatoday/images/story/201908/yuvi072019_0-770x433.png?J6gK8hQzFDlCp8ib8Hac7WvO9IA2Q0uY',
            description:'The inaugural Global T20 tournament in Canada got embroiled in controversy on Wednesday after players refused to board the team bus due to outstanding payments, journalist Peter Del Penna said on his Twitter handle and attributed to sources.'},
            {
              headline:'Super 30 Movie Review: Hrithik Roshan is earnest as Anand Kumar but Vikas Bahl film does not add up',
              img:'https://akm-img-a-in.tosshub.com/indiatoday/images/story/201907/Super30-770x433.jpeg?dAY7ZwPuFLHyH0nlmtFDwI2vtSyIH_b7',
              description:'The long-gestating Super 30 tells the inspiring story of math genius Anand Kumar, who is attempting to change the lives of meritorious but destitute students, 30 at a time. Despite the rousing tale and fine performances, the film is bogged down by the lengthy run-time and needless doses of drama.'
            }]
  
  sendNews(nws){
  this.newsData=nws;
  }
  constructor() { }

  ngOnInit() {
  }

}
