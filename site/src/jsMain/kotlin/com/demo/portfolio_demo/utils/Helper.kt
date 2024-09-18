package com.demo.portfolio_demo.utils

import com.demo.portfolio_demo.components.model.EducationData
import com.demo.portfolio_demo.components.model.Researches
import com.demo.portfolio_demo.components.model.Trainings
import com.demo.portfolio_demo.components.model.WorkExperience

fun getAllWritings() =
    listOf(
        Pair(Res.Images.WRITING_IMAGE_08, Constants.TUMBLR_URL),
//        Pair(Res.Images.WRITING_IMAGE_09, ""),
    )

fun getAllWorkExperience() = listOf(
    WorkExperience(
        sequenceNumber = "01",
        role = "Program Officer (Education)",
        organization = "Unnayan Sangha (Jamalpur)",
        duration = "Dec 2021 - Jun 2023"
    ),
    WorkExperience(
        sequenceNumber = "02",
        role = "ESL Trainer (Freelance)",
        organization = "Reliable Global Studies",
        duration = "Jan 2021 - Sep 2023"
    ),
    WorkExperience(
        sequenceNumber = "03",
        role = "IB PYP Teacher",
        organization = "Abdul Kadir Mollah International School",
        duration = "2018 - 2019"
    ),
    WorkExperience(
        sequenceNumber = "04",
        role = "English Language and Literature Teacher",
        organization = "Bangladesh International Tutorial (BIT)",
        duration = "2017 - 2018"
    ),
    WorkExperience(
        sequenceNumber = "05",
        role = "SSURDA Communication Officer",
        organization = "Society for Sustainable Development or the Rural and Urban Area (SSURDA)",
        duration = "2015 - 2017"
    )
)

fun getAllCoActivities() =
    listOf(
        Pair(Res.Images.CO_ACTIVITY_IMAGE_1, ""),
        Pair(Res.Images.CO_ACTIVITY_IMAGE_2, ""),
        Pair(Res.Images.CO_ACTIVITY_IMAGE_3, "AIUB Debate Club Events"),
        Pair(Res.Images.CO_ACTIVITY_IMAGE_4, "Participation of drama seven deadly sins by Christopher Marlow"),
        Pair(Res.Images.CO_ACTIVITY_IMAGE_5, "Public speaking and hosting"),
        Pair(Res.Images.CO_ACTIVITY_IMAGE_6, "Seminar on writing club ''wordsmiths pen"),
    )

fun getAllPhotographs() =
    listOf(
        Res.Images.IMAGE_1,
        Res.Images.IMAGE_2,
        Res.Images.IMAGE_3,
        Res.Images.IMAGE_4,
        Res.Images.IMAGE_5,
        Res.Images.IMAGE_6,
        Res.Images.IMAGE_7,
        Res.Images.IMAGE_8,
        Res.Images.IMAGE_9,
        Res.Images.IMAGE_10,
        Res.Images.IMAGE_11,
        Res.Images.IMAGE_12,
    )

fun getAllResearch() = listOf(
    Researches(
        title = "Cultural and Religious Influences on Women's Rights and the Social Prejudice Faced by Divorced Women in Bangladesh.",
        subTitle = "",
        link = "",
        type = "Dissertation"
    ),
    Researches(
        title = "Coetzee’s Disgrace: Rape and Escape connection to Bangladeshi perspectives.",
        subTitle = "ARJEL (American Research Journal of English language and Literature) Volume 7 DOI: : 10.21694/2378-9026.21009",
        link = "https://www.arjonline.org/papers/arjel/v7-i1/9.pdf",
        type = "Published"
    ),
    Researches(
        title = "A 3D Saga of Bangladeshi Woman (divorced, diluted and deprived vs dream, determined and destination).",
        subTitle = "",
        link = "",
        type = "Ongoing"
    ),
    Researches(
        title = "Low budget framed quality Educations and SEEDS project by UNNAYAN Sangha.",
        subTitle = "",
        link = "",
        type = "Ongoing"
    ),
    Researches(
        title = "Significant ethnographic case studies “Rohingyas” and trivial people: identity crisis and threat to peace.",
        subTitle = "",
        link = "",
        type = "Ongoing"
    ),
    Researches(
        title = "SHOFOL as a successful project for the indigenous orphaned children and achievements.",
        subTitle = "",
        link = "",
        type = "Ongoing"
    ),
    Researches(
        title = "Distinctive Features and Socioeconomic Impacts of Chinese Foreign Aid in Recipient Nations.",
        subTitle = "",
        link = "",
        type = "Unpublished"
    ),
    Researches(
        title = "Intersectionality in Global Development: A Critical Analysis of Theoretical Approaches and Applied Practices.",
        subTitle = "",
        link = "",
        type = "Unpublished"
    ),
    Researches(
        title = "Women sexism and South Asian dogma: A Momentum looks into the Kamla Das poetry.",
        subTitle = "",
        link = "",
        type = "Unpublished"
    ),
    Researches(
        title = "Revisiting Development Paradigms: Challenging the Illusion of Post-Colonial Progress.",
        subTitle = "",
        link = "",
        type = "Unpublished"
    ),
    Researches(
        title = "Advancing Inclusive Education and Gender Equality: Empowering Indigenous Young Girls in Bangladesh through Quality Learning Opportunities.",
        subTitle = "",
        link = "",
        type = "Unpublished"
    ),
    Researches(
        title = "Understanding the Interplay Between Education and Violent Conflict Through a Human Rights Lens: Case Studies and Implications.",
        subTitle = "",
        link = "",
        type = "Unpublished"
    ),
    Researches(
        title = "Breaking boundaries from theory to practice: A critical assessment of the attempt to integrate Kolbe’s “Experiential Learning Journey” into the educational framework of the National Curriculum and Textbook Board (NCTB) of Bangladesh",
        subTitle = "",
        link = "",
        type = "Unpublished"
    )
)

fun getAllEducation() = listOf(
    EducationData(
        degree = "Master's in Global Development",
        institution = "University of East Anglia",
        duration = "Sep 2023 - Sep 2024"
    ),
    EducationData(
        degree = "Post-Graduation Diploma in International Relations",
        institution = "University of Dhaka",
        duration = "2017 - 2018"
    ),
    EducationData(
        degree = "BA in English Literature",
        institution = "American International University of Bangladesh (AIUB)",
        duration = "2013 - 2016"
    )
)


fun getAllTrainings() = listOf(
    Trainings(
        title = "TESOL Methodology (online), University of Maryland,2020",
        topic = "",
        link = ""
    ),
    Trainings(
        title = "IB administration and coordination",
        topic = "UOI integration with other subjects Abdul Kadir Molla International School (AKMIS)Bangladesh In House",
        link = ""
    ),
    Trainings(
        title = "The vital role of the teaching in the PYP Implementing different strategies for Development Abdul Kadir Molla International School (AKMIS)",
        topic = "",
        link = ""
    ),
    Trainings(
        title = "Anti-radicalisation & 'Prevent' - Awareness Training for Schools",
        topic = "",
        link = "https://www.candidatego.com/certificate/84ADuq8X5ss3XJ74EmicYq"
    ),
    Trainings(
        title = "Safeguarding - An Introduction for Teachers and Staff",
        topic = "",
        link = "https://www.candidatego.com/certificate/GxWfSJQhyYaLczVEKMJAwy"
    ),
)