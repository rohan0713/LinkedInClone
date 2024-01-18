package com.social.linkedinclone

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun ProfileCompose() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {

        Column(modifier = Modifier.fillMaxSize()) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {

                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = null,
                    modifier = Modifier
                        .weight(0.1f)
                        .padding(top = 10.dp, bottom = 10.dp),
                    tint = Color.Gray
                )

                Row(
                    modifier = Modifier
                        .weight(0.6f)
                        .background(Color.DarkGray)
                        .padding(start = 10.dp, end = 10.dp)
                        .clip(RoundedCornerShape(10.dp))
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        tint = Color.Gray,
                        modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                    )

                    Text(
                        text = "Rohan Ramola", color = Color.LightGray,
                        modifier = Modifier.padding(start = 5.dp, top = 10.dp, bottom = 10.dp),
                        fontSize = 16.sp
                    )
                }

                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = null,
                    modifier = Modifier
                        .weight(0.1f)
                        .padding(top = 10.dp, bottom = 10.dp),
                    tint = Color.Gray
                )
            }

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                item {

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(220.dp)
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.ic_android),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(120.dp),
                            contentScale = ContentScale.Crop
                        )

                        Box(
                            modifier = Modifier
                                .wrapContentSize()
                                .align(Alignment.TopEnd)
                                .padding(10.dp)
                                .clip(
                                    CircleShape
                                )
                        ) {

                            Icon(
                                imageVector = Icons.Default.Edit, contentDescription = null,
                                modifier = Modifier
                                    .size(40.dp)
                                    .background(Color.Black)
                                    .padding(12.dp),
                                tint = Color.White
                            )

                        }


                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomStart)
                        ) {

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                            }

                            Box(
                                modifier = Modifier
                                    .size(150.dp)
                                    .padding(10.dp)
                                    .clip(CircleShape)
                                    .background(Color.Black)
                            ) {

                                Image(
                                    painter = painterResource(id = R.drawable.ic_cover),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .border(2.dp, Color.DarkGray, shape = CircleShape)
                                        .padding(5.dp)
                                        .clip(CircleShape)
                                )

                            }

                        }
                    }

                    Text(
                        text = "Rohan Ramola", color = Color.LightGray,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 20.dp)
                    )


                    Text(
                        text = "Software Engineer | Android Application Development | Kotlin | Jetpack Compose",
                        color = Color.LightGray,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(start = 20.dp, end = 20.dp),
                    )

                    Text(
                        text = "500+ connections", color = Color.Green,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 20.dp, top = 10.dp)
                    )


                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {

                        Button(
                            onClick = {},
                            modifier = Modifier.weight(0.4f),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.DarkGray
                            )
                        ) {

                            Text(text = "Open to")

                        }
                        Spacer(modifier = Modifier.size(10.dp))

                        Button(
                            onClick = {},
                            modifier = Modifier.weight(0.4f),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.DarkGray
                            )
                        ) {
                            Text(text = "Add Section")
                        }
                    }

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(5.dp)
                            .background(Color.DarkGray)
                            .padding(top = 20.dp)
                    )

                    Text(
                        text = "Analytics", color = Color.LightGray,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 20.dp, top = 20.dp)
                    )

                    Row(
                        modifier = Modifier
                            .padding(start = 20.dp, end = 20.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_eye),
                            contentDescription = null,
                            tint = Color.Gray,
                            modifier = Modifier
                                .size(20.dp)
                                .padding(top = 3.dp)
                        )

                        Text(
                            text = "Private to you", color = Color.Gray,
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 5.dp, top = 1.dp)
                        )
                    }

                    Row(
                        modifier = Modifier
                            .padding(20.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = null,
                            tint = Color.LightGray,
                            modifier = Modifier
                                .size(30.dp)
                                .padding(top = 3.dp),
                        )

                        Column(modifier = Modifier.height(40.dp)) {

                            Text(
                                text = "50 profile views", color = Color.LightGray,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.ExtraBold,
                                modifier = Modifier.padding(start = 5.dp, top = 1.dp)
                            )

                            Text(
                                text = "Discover who viewed your profile.", color = Color.LightGray,
                                fontSize = 14.sp,
                                modifier = Modifier.padding(start = 5.dp, top = 1.dp)
                            )
                        }
                    }

                    Row(
                        modifier = Modifier
                            .padding(20.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null,
                            tint = Color.LightGray,
                            modifier = Modifier
                                .size(30.dp)
                                .padding(top = 3.dp),
                        )

                        Column(modifier = Modifier.height(40.dp)) {

                            Text(
                                text = "19 search appearances", color = Color.LightGray,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.ExtraBold,
                                modifier = Modifier.padding(start = 5.dp, top = 1.dp)
                            )

                            Text(
                                text = "See how often you appear in search results.",
                                color = Color.LightGray,
                                fontSize = 14.sp,
                                modifier = Modifier.padding(start = 5.dp, top = 1.dp)
                            )
                        }
                    }

                    borderCompose()

                }

                item {


                    Text(
                        text = "Resources", color = Color.LightGray,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 20.dp, top = 20.dp)
                    )

                    Row(
                        modifier = Modifier
                            .padding(start = 20.dp, end = 20.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_eye),
                            contentDescription = null,
                            tint = Color.Gray,
                            modifier = Modifier
                                .size(20.dp)
                                .padding(top = 3.dp)
                        )

                        Text(
                            text = "Private to you", color = Color.Gray,
                            fontSize = 14.sp,
                            modifier = Modifier.padding(start = 5.dp, top = 1.dp)
                        )
                    }

                    Row(
                        modifier = Modifier
                            .padding(20.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = null,
                            tint = Color.LightGray,
                            modifier = Modifier
                                .size(30.dp)
                                .padding(top = 3.dp),
                        )

                        Column(modifier = Modifier.height(40.dp)) {

                            Text(
                                text = "Creator mode", color = Color.LightGray,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.ExtraBold,
                                modifier = Modifier.padding(start = 5.dp, top = 1.dp)
                            )

                            Text(
                                text = "Get discovered, showcase content on your profile, and get access to creator tools.",
                                color = Color.LightGray,
                                fontSize = 14.sp,
                                modifier = Modifier.padding(start = 5.dp, top = 1.dp)
                            )
                        }
                    }


                    Row(
                        modifier = Modifier
                            .padding(20.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null,
                            tint = Color.LightGray,
                            modifier = Modifier
                                .size(30.dp)
                                .padding(top = 3.dp),
                        )

                        Column(modifier = Modifier.height(40.dp)) {

                            Text(
                                text = "My network", color = Color.LightGray,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.ExtraBold,
                                modifier = Modifier.padding(start = 5.dp, top = 1.dp)
                            )

                            Text(
                                text = "See and manage your connections and interests.",
                                color = Color.LightGray,
                                fontSize = 14.sp,
                                modifier = Modifier.padding(start = 5.dp, top = 1.dp)
                            )
                        }
                    }

                    borderCompose()

                    AboutCompose()
                    borderCompose()

                    ActivityCompose()
                    borderCompose()

                    ExperienceCompose()
                    borderCompose()

                    LicenseCompose()
                    borderCompose()

                    EducationCompose()
                    borderCompose()

                    SkillsCompose()
                    borderCompose()

                }

            }
        }
    }
}

@Preview
@Composable
fun SkillsCompose() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
    ) {

        Column(modifier = Modifier.padding(20.dp)) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Column(modifier = Modifier.wrapContentSize()) {

                    Text(
                        text = "Skills", color = Color.LightGray,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                    )

                }

                Row(modifier = Modifier.wrapContentSize(),
                horizontalArrangement = Arrangement.spacedBy(20.dp)) {

                    Box(
                        modifier = Modifier
                            .wrapContentSize()
                            .border(
                                1.dp,
                                Color.Green,
                                shape = RoundedCornerShape(30.dp)
                            )
                    ) {

                        Text(
                            text = "Take a skill quiz",
                            color = Color.Green,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(
                                start = 15.dp,
                                end = 15.dp,
                                top = 10.dp,
                                bottom = 10.dp
                            )
                        )
                    }

                    Icon(
                        imageVector = Icons.Default.Add, contentDescription = null,
                        tint = Color.LightGray,
                        modifier = Modifier.size(30.dp)
                    )
                    Icon(
                        imageVector = Icons.Default.Edit, contentDescription = null,
                        tint = Color.LightGray,
                        modifier = Modifier.size(30.dp)
                    )
                }
            }

            Text(
                text = "Kotlin",
                color = Color.LightGray,
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            ) {

                Image(painter = painterResource(id = R.drawable.ic_cover),
                    modifier = Modifier.size(40.dp),
                    contentDescription = null,
                contentScale = ContentScale.Crop)

                Text(
                    text = "Associate Software Engineer at IBM",
                    color = Color.LightGray,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(start = 5.dp)
                )
            }

            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                color = Color.Gray
            )

            Text(
                text = "Android",
                color = Color.LightGray,
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp)
            ) {

                Image(painter = painterResource(id = R.drawable.ic_cover),
                    modifier = Modifier.size(40.dp),
                    contentDescription = null,
                    contentScale = ContentScale.Crop)

                Text(
                    text = "Associate Software Engineer at IBM",
                    color = Color.LightGray,
                    fontSize = 15.sp,
                    modifier = Modifier.padding(start = 5.dp)
                )
            }

            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                color = Color.Gray
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp),
                contentAlignment = Alignment.Center
            ) {

                Row(
                    horizontalArrangement = Arrangement.spacedBy(5.dp),
                    modifier = Modifier.wrapContentSize()
                ) {

                    Text(
                        text = "Show All 29 skills",
                        color = Color.LightGray,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.ExtraBold
                    )

                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = null,
                        tint = Color.LightGray
                    )
                }
            }

        }

    }
}


@Preview
@Composable
fun LicenseCompose() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
    ) {

        Column(modifier = Modifier.padding(20.dp)) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Column(modifier = Modifier.wrapContentSize()) {

                    Text(
                        text = "Licenses & certifications", color = Color.LightGray,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                    )

                }

                Row(
                    modifier = Modifier.wrapContentSize(),
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ) {

                    Icon(
                        imageVector = Icons.Default.Add, contentDescription = null,
                        tint = Color.LightGray
                    )
                    Icon(
                        imageVector = Icons.Default.Edit, contentDescription = null,
                        tint = Color.LightGray
                    )

                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.ic_android),
                    contentDescription = null,
                    modifier = Modifier.size(60.dp),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.size(10.dp))

                Column(modifier = Modifier.fillMaxWidth()) {

                    Text(
                        text = "Azure Developer Associate",
                        fontSize = 16.sp,
                        color = Color.LightGray,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Microsoft",
                        fontSize = 14.sp,
                        color = Color.LightGray,
                    )

                    Text(
                        text = "Issued Jan 2023 - Expired Jan 2024",
                        fontSize = 14.sp,
                        color = Color.Gray,
                    )

                    Box(
                        modifier = Modifier
                            .wrapContentSize()
                            .padding(top = 10.dp)
                            .border(1.dp, Color.White, shape = RoundedCornerShape(20.dp))
                    ) {

                        Text(
                            text = "Show credential", modifier = Modifier
                                .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp),
                            color = Color.White
                        )
                    }
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.ic_android),
                    contentDescription = null,
                    modifier = Modifier.size(60.dp),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.size(10.dp))

                Column(modifier = Modifier.fillMaxWidth()) {

                    Text(
                        text = "Android Application Development",
                        fontSize = 16.sp,
                        color = Color.LightGray,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Coding Blocks",
                        fontSize = 14.sp,
                        color = Color.LightGray,
                    )

                    Box(
                        modifier = Modifier
                            .wrapContentSize()
                            .padding(top = 10.dp)
                            .border(1.dp, Color.White, shape = RoundedCornerShape(20.dp))
                    ) {

                        Text(
                            text = "Show credential", modifier = Modifier
                                .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp),
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun EducationCompose() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
    ) {

        Column(modifier = Modifier.padding(20.dp)) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Column(modifier = Modifier.wrapContentSize()) {

                    Text(
                        text = "Education", color = Color.LightGray,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                    )

                }

                Row(
                    modifier = Modifier.wrapContentSize(),
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ) {

                    Icon(
                        imageVector = Icons.Default.Add, contentDescription = null,
                        tint = Color.LightGray
                    )
                    Icon(
                        imageVector = Icons.Default.Edit, contentDescription = null,
                        tint = Color.LightGray
                    )

                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.ic_cover),
                    contentDescription = null,
                    modifier = Modifier.size(60.dp),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.size(10.dp))

                Column(modifier = Modifier.fillMaxWidth()) {

                    Text(
                        text = "Amity University",
                        fontSize = 16.sp,
                        color = Color.LightGray,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Master of Computer Applications - MCA",
                        fontSize = 14.sp,
                        color = Color.LightGray,
                    )

                    Text(
                        text = "2019 - 2022",
                        fontSize = 14.sp,
                        color = Color.Gray,
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.ic_cover),
                    contentDescription = null,
                    modifier = Modifier.size(60.dp),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.size(10.dp))

                Column(modifier = Modifier.fillMaxWidth()) {

                    Text(
                        text = "Delhi University",
                        fontSize = 16.sp,
                        color = Color.LightGray,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Bachelor of Science, BSc. (CS)",
                        fontSize = 14.sp,
                        color = Color.LightGray,
                    )

                    Text(
                        text = "2015 - 2018",
                        fontSize = 14.sp,
                        color = Color.Gray,
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun ExperienceCompose() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
    ) {

        Column(modifier = Modifier.padding(20.dp)) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Column(modifier = Modifier.wrapContentSize()) {

                    Text(
                        text = "Experience", color = Color.LightGray,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                    )

                }

                Row(
                    modifier = Modifier.wrapContentSize(),
                    horizontalArrangement = Arrangement.spacedBy(20.dp)
                ) {

                    Icon(
                        imageVector = Icons.Default.Add, contentDescription = null,
                        tint = Color.LightGray
                    )
                    Icon(
                        imageVector = Icons.Default.Edit, contentDescription = null,
                        tint = Color.LightGray
                    )

                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.ic_android),
                    contentDescription = null,
                    modifier = Modifier.size(60.dp),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.size(10.dp))

                Column(modifier = Modifier.fillMaxWidth()) {

                    Text(
                        text = "Associate System Engineer",
                        fontSize = 16.sp,
                        color = Color.LightGray,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "IBM - Full time",
                        fontSize = 14.sp,
                        color = Color.LightGray,
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.ic_android),
                    contentDescription = null,
                    modifier = Modifier.size(60.dp),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.size(10.dp))

                Column(modifier = Modifier.fillMaxWidth()) {

                    Text(
                        text = "Software Development Executive",
                        fontSize = 16.sp,
                        color = Color.LightGray,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Skrolled - Internship",
                        fontSize = 14.sp,
                        color = Color.LightGray,
                    )
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.ic_android),
                    contentDescription = null,
                    modifier = Modifier.size(60.dp),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.size(10.dp))

                Column(modifier = Modifier.fillMaxWidth()) {

                    Text(
                        text = "Software Development Consultant",
                        fontSize = 16.sp,
                        color = Color.LightGray,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Prodevans Technologies - Internship",
                        fontSize = 14.sp,
                        color = Color.LightGray,
                    )
                }
            }
        }
    }
}

@Composable
fun borderCompose() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(5.dp)
            .background(Color.DarkGray)
            .padding(top = 30.dp)
    )
}


@Preview
@Composable
fun AboutCompose() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
    ) {

        Column(modifier = Modifier.padding(20.dp)) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = "About", color = Color.LightGray,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                )

                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = null,
                    tint = Color.LightGray
                )
            }

            Text(
                text = "I am a passionate and results-driven programmer with a strong focus on creating innovative and user-friendly Android applications.  I am always eager to stay up-to-date with the latest trends in technologies and embrace best practices to ensure the highest quality standards. If you're seeking someone for an Android Developer or Software Engineer role with a proven track record of delivering outstanding applications, I would be thrilled to connect with you.",
                color = Color.LightGray,
                fontSize = 14.sp,
                modifier = Modifier.padding(top = 20.dp)
            )
        }
    }
}

@Preview
@Composable
fun ActivityCompose() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
    ) {

        Column(modifier = Modifier.padding(20.dp)) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Column(modifier = Modifier.wrapContentSize()) {

                    Text(
                        text = "Activity", color = Color.LightGray,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                    )

                    Text(
                        text = "493 followers", color = Color.Green,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }

                Row(modifier = Modifier.wrapContentSize()) {

                    Box(
                        modifier = Modifier
                            .wrapContentSize()
                            .border(
                                1.dp,
                                Color.Green,
                                shape = RoundedCornerShape(30.dp)
                            )
                    ) {

                        Text(
                            text = "Create a post",
                            color = Color.Green,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(
                                start = 15.dp,
                                end = 15.dp,
                                top = 10.dp,
                                bottom = 10.dp
                            )
                        )
                    }
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            ) {

                Text(
                    text = "Rohan Ramola",
                    color = Color.LightGray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.ExtraBold
                )

                Text(
                    text = "commented on a post",
                    color = Color.LightGray,
                    fontSize = 13.sp,
                    modifier = Modifier.padding(start = 5.dp)
                )
            }

            Text(
                text = "Great information!",
                color = Color.LightGray,
                fontSize = 14.sp,
                modifier = Modifier.padding(top = 10.dp)
            )

            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                color = Color.Gray
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 15.dp),
                contentAlignment = Alignment.Center
            ) {

                Row(
                    horizontalArrangement = Arrangement.spacedBy(5.dp),
                    modifier = Modifier.wrapContentSize()
                ) {

                    Text(
                        text = "Show All Activity",
                        color = Color.LightGray,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.ExtraBold
                    )

                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = null,
                        tint = Color.LightGray
                    )
                }
            }

        }

    }
}