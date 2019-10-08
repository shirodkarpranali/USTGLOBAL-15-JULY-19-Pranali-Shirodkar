import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
newsData:any='';
news=[
{
  headline:'Death Toll in Kerala Floods Rises to 28; 2.52 Lakh Rescued in Maharashtra',
  img:"https://images.news18.com/ibnlive/uploads/2019/08/wayanad-floods.jpg ",
  description:'Rail, road and air transport took a hit in the state with several trains being cancelled and the Cochin International Airport shut till August 11 due to waterlogging in almost 60 per cent region of its operational area.'
},
{
  headline:'Sharad Pawar Speaks to PM on Maharashtra Floods, Seeks More Discharge from Almatti Dam',
  img:"https://images.news18.com/ibnlive/uploads/2019/01/sharad-pawar.jpg",
  description:'Mumbai: NCP chief Sharad Pawar said on Friday evening that he sought Prime Minister Narendra Modis intervention to ensure that Karnataka discharged enough water from Almatti dam so that floodwaters upstream in Western Maharashtra receded quicker.Modi assured him that he would speak to chief ministers of both the states, Pawar told PTI.'
},
{
  headline:'Varun Dhawan to Turn Fundraiser to Help Farmers in Maharashtra Deal with Water Crisis',
  img:"https://images.news18.com/ibnlive/uploads/2018/11/Varun-Dhawan1.jpg",
  description:'Bollywood star Varun Dhawan will raise funds for farmers in Maharashtra through actor Arjun Kapoors sister Anshula Kapoors online fundraising platform Fankind. As part of a campaign on Fankind, a fan will get to play a game of paintball with Varun. Fans have to buy entries for a minimum of Rs 300 or multiples thereof, which will enable them to become part of a random selection process by a third party.'
},
{
  headline:'Frustrated and Desperate: Devendra Fadnavis Targets Opposition as it Raises Doubts Over EVM Results',
  img:"https://images.news18.com/ibnlive/uploads/2017/02/Devendra-Fadnavis-pti-875.jpg",
  description:'Nagpur: Maharashtra Chief Minister Devendra Fadnavis said on Saturday that the state had never seen such "frustrated, desperate and directionless" opposition in its history.Fadnavis, while addressing a press conference here, also said that opposition was unable to understand that EVM is a machine, which is unable to cast votes on its own.His statements come a day after prominent opposition leaders, including state Congress president Balasaheb Thorat, MNS chief Raj Thackeray, NCPs Ajit Pawar and Chhagan Bhujbal, among others, termed the Lok Sabha polls results as "shocking" raised concern over the use of Electronic Voting Machines (EVMs).Fadnavis was here as part of his month-long Maha Janadesh Yatra, which he launched on Thursday. The yatra will now head to Bhandara and Gondia districts.'},
{
  headline:'2 Days After Passing of Triple Talaq Bill, Case Registered Against Thane Man Under New Law',
  img:"https://images.news18.com/ibnlive/uploads/2017/08/triple-talaq-2.jpg",
  description:'Thane: Two days after the bill criminalising triple talaq was passed, Thane police in Maharashtra registered a case against a man who allegedly gave talaq to his wife through WhatsApp.Police at Mumbra near here on Thursday night registered an FIR under IPC section 498 A (husband or relative of husband of a woman subjecting her to cruelty) and section 4 of the Muslim Women (Protection of Rights on Marriage) Act.Under section 4 of the new act — passed by Parliament on July 30 — a Muslim husband who pronounces triple talaq is liable to be punished by imprisonment up to three years and fine.The FIR was lodged on the basis of a complaint by a 31-year-old woman, said senior police inspector Madhukar Kad.Between 2015 and 2018, her husband, mother-in-law and sister-in-law harassed her for dowry, and her husband gave her triple talaq over phone and WhatsApp, the woman told police.Nobody has been arrested in the case yet.'
},
{
  headline:'Premier League 2019-20 Season Kicks Off With This Tech Loaded Football in Play',
  img:"https://images.news18.com/ibnlive/uploads/2019/08/Nike-Merlin-Premier-League-201920.jpg",
  description:'The 2019/20 Premier League season in England kicks off later tonight with the European Champions Liverpool taking on Norwich at Anfield, Liverpool. The ball that will be used for the Premier League this year is the Nike Merlin, and this ball is exclusive for use in the Premier League only. This incidentally also marks the 200-year partnership between Nike and the Premier League. This isn’t just any football though, and there is a lot of smart tech infusion that perhaps makes it better than the very capable ones that came before it.The Nike Merlin is made of four fuse-welded panels that are joined together. The idea is to extend the "sweet spot" that footballers look for, with fewer seams and thereby joined pieces getting in the way. Good news then for those midfielders who like slick passes, and even for those who like to ping long and accurate passes (also known as Hollywood passes) to catch opposition defenders out of position. Then there is the Urban Grip tech, which is an update for Nike’s All Conditions Control (ACC) technology. The Premier League fixtures are played in a variety of conditions, including rain, drizzle and even snow at times.'
},
{
  headline:'Pakistan Suspends Bus Service with India a Day after Shelving Samjhauta Express',
  img:"https://images.news18.com/ibnlive/uploads/2019/03/India-Pakistan-flags.jpg",
  description:'New Delhi: Pakistan on Friday announced its decision to suspend the bus service with India, a day after it said the Samjhauta Express train service would be cancelled.Pakistan earlier in the day announced it will suspend the Thar Express train service with India, which links the two countries across the Rajasthan border, a day after it stopped the Samjhauta Express following its decision to downgrade bilateral ties.'
},
{
  headline:'NIA Arrests Man For Smuggling Drug Worth Rs 2,700 Crore from Pakistan',
  img:"https://images.news18.com/ibnlive/uploads/2017/07/brking_shipofdrugs_aritraphnr_2.jpg",
  description:'New Delhi: The NIA on Friday arrested a person in connection with the alleged smuggling of narcotics worth Rs 2,700 crore from Pakistan.In its biggest-ever haul, the Customs department had seized 532 kg of suspected heroin smuggled into India from Pakistan in a truck through trade route at the Attari border on June 29. Two persons were arrested in connection with the case in June.Tariq Ahmed Lone (28), a resident of Kupwara was arrested and a case under relevant provisions of the Unlawful Activities (Prevention) Act and Narcotic Drugs and Psychotropic Substances (NDPS) Act was registered against him, an official spokesperson of the premier investigating agency said.Lone was produced before a special NIA court in Mohali which remanded him to NIA custody for eight days, he added.'
},
{
  headline:'Kashmir Dispatch 1 | Food and Fear a Struggle as Kashmiris Grapple With the New Normal on Day 4 of Lockdown',
  img:"https://images.news18.com/ibnlive/uploads/2019/08/AP8_8_2019_000222B.jpg",
  description:'Srinagar: Streets in Srinagar are desolate as the city is in the middle of the fourth day of a government clampdown. Authorities have imposed section 144 of the Criminal Procedure Code (CrPC) – prohibiting the assembly of four or more people. The restrictions are sterner than a curfew.Paramilitary troopers are fanning across Srinagar and the towns of Kashmir valley. Barricades of concertina wire manned by forces have been installed at the exit and entry points of all key streets and bridges.'
},
{
  headline:'Labourer Dies as Building Collapses During Demolition in Mumbai',
  img:"https://images.news18.com/ibnlive/uploads/2016/08/BUILDING-COLLAPSE-PKG.jpg",
  description:`Mumbai: A labourer died when a dilapidated building under the jurisdiction of the Maharashtra Housing and Area Development Authority (MHADA) collapsed while it was being demolished in south Mumbai.
   on Friday, police said.Fire had broken at Sayyad building in Masjid Bunder area on July 3. The flames were extinguished after two days.`
}  
]


constructor() {}
sendNews(i){
  this.newsData = i;
}
 


  ngOnInit() {
  }



}
