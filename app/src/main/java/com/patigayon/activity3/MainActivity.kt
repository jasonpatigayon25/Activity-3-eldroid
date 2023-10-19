package com.patigayon.activity3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.patigayon.activity3.databinding.ActivityMainBinding
import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val itemList = listOf(
            DataModel(
                "Naruto Uzumaki",
                "Software Developer Application",
                "Hey, it's me, Naruto! I want to be the Hokage of software development. Believe it! With my Rasengan coding skills, we can take on any software challenge!"
            ),
            DataModel(
                "Sasuke Uchiha",
                "Backend Developer Application",
                "I'm Sasuke Uchiha. With my Sharingan, I can analyze and solve backend problems in the blink of an eye. Together, we'll achieve perfection in our code."
            ),
            DataModel(
                "Sakura Haruno",
                "UI/UX Designer Application",
                "Hello, Sakura Haruno here! With precise chakra control, I can craft the most user-friendly interfaces. Let's create designs that resonate with users' hearts!"
            ),
            DataModel(
                "Kakashi Hatake",
                "Lead Developer Application",
                "Copy Ninja Kakashi at your service. I've copied a thousand jutsus, and I can adapt to any coding language or framework. Let's guide our team to success!"
            ),
            DataModel(
                "Hinata Hyuga",
                "Quality Assurance Specialist Application",
                "This is Hinata. With my Byakugan, I can see through any code and detect bugs or inefficiencies. Let's ensure our software is flawless!"
            ),
            DataModel(
                "Hanamichi Sakuragi",
                "Frontend Developer Application",
                "Hey! I'm Sakuragi, the genius of Slam Dunk. Though I might be new to the game, my passion and dedication can make any frontend look stunning!"
            ),
            DataModel(
                "Kaede Rukawa",
                "Backend Developer Application",
                "Rukawa here. With my skills on the court, I'll make sure our backend services run as smoothly as my plays. Let's dominate the software league!"
            ),
            DataModel(
                "Takenori Akagi",
                "DevOps Engineer Application",
                "Akagi, Shohoku's captain. I'll lead our DevOps just as I lead my team on the court. With strategy and strength, we'll deploy the best pipelines!"
            ),
            DataModel(
                "Ryota Miyagi",
                "Mobile App Developer Application",
                "Miyagi here! Speed and agility are my assets on the court and in app development. Let's create fast and efficient mobile apps!"
            ),
            DataModel(
                "Mitsui Hisashi",
                "Database Administrator Application",
                "It's Mitsui! My comeback story on the court mirrors my dedication to maintaining robust databases. Let's secure our data and make game-winning plays!"
            ),
            DataModel(
                "Rudeus Greyrat",
                "Cloud Solutions Architect Application",
                "Hello! I'm Rudeus, once a NEET, now a top-tier magician. Just as I mastered magic from scratch, I'll architect cloud solutions that will impress even the gods!"
            ),
            DataModel(
                "Eris Boreas Greyrat",
                "Mobile Game Developer Application",
                "Eris here! With my fierce sword skills and fiery temper, I'll craft engaging mobile games that will captivate players. Let's slice through the competition!"
            ),
            DataModel(
                "Roxy Migurdia",
                "Online Learning Platform Developer Application",
                "Roxy Migurdia, renowned tutor, applying. Let's harness my teaching experience to create comprehensive online learning platforms. Making education magical!"
            ),
            DataModel(
                "Sylphiette",
                "AI Developer Application",
                "Sylphie here! With my immense magical talent, I'll program AI systems as intuitive and intelligent as my spells. Let's create magic with technology!"
            ),
            DataModel(
                "Ghilane",
                "Security Analyst Application",
                "Beast tamer Ghilane at your service. I'll guard our digital assets as fiercely as I tame the mightiest beasts. Our systems will be impenetrable!"
            ),
            DataModel(
                "Twilight (Loid Forger)",
                "Stealth Backend Developer Application",
                "Agent Twilight reporting in. My espionage skills translate to creating stealthy and efficient backend solutions. No challenge too covert for me!"
            ),
            DataModel(
                "Yor Forger",
                "Software Testing Specialist Application",
                "It's Yor, an assassin turned tester. I'll detect software vulnerabilities with the same precision I use in my missions. Ensuring flawless execution!"
            ),
            DataModel(
                "Anya Forger",
                "User Experience Researcher Application",
                "Little Anya here! With my unique ability to read thoughts, I'll understand user needs like no other. Making apps people truly love!"
            ),
            DataModel(
                "Franky (Franz)",
                "Hardware Technician Application",
                "Franky, the loyal dog, applying. Just as I'm reliable in missions, I'll ensure our hardware runs smoothly. Tech support with a bark!"
            ),
            DataModel(
                "Bond",
                "Network Administrator Application",
                "Agent Bond, the suave cat, at your service. I'll manage networks with the same elegance I exhibit in the field. Connectivity, shaken, not stirred!"
            )



        )


        val myAdapter = RecyclerAdapter(itemList, ::onItemClick)

        with(binding.recyclerView) { // Make sure "recyclerView" is the correct ID from your XML layout
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = myAdapter
        }
    }

    private fun onItemClick(item: DataModel) {
        // Handle the item click here
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("NAME_PARAMS", item.name)
            putExtra("SUBJECT_PARAMS", item.subject)
            putExtra("MESSAGE_PARAMS", item.body)
        }
        startActivity(intent)
    }

}