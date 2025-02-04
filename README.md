# Unit 4 - Personal Narrative

## Introduction

Images are often used to portray our personal experiences and interests. We also use image filters and effects to change or enhance the mood of an image. When combined into collages and presentations, these images tell a story about who we are and what is important to us. Your goal is to create a personal narrative using The Theater that consists of images of your personal experiences and/or interests, incorporates data related to these experiences and/or interests that can be organized in a 2D array, and uses image filters and effects to change or enhance the mood of your images.

## Requirements

Use your knowledge of object-oriented programming, two-dimensional (2D) arrays, and algorithms to create your personal narrative collage or animation:

- **Create at least two 2D arrays** – Create at least two 2D arrays to store the data that will make up your visualization.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and two-way or multi-selection statements with compound Boolean expressions to analyze the data.
- **Use Image Filters** - Include multiple image filters learned from this unit, and additionally create new ones of your own.
- **Use methods in the String class** – Use one or more methods in the String class in your program, such as to determine whether the name of an image file contains specific characters.
- **Create a visualization** – Create an image or animation that conveys the story of the data by illustrating the patterns or relationships in the data.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get display on this README.

![UML Diagram for my project](nameOfImageFileHere.png)

## Video

Record a short video of your story to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown

[![My personal Narrative Project](Spain.png)]([youtube-URL-here](https://youtube.com/shorts/OcFGn3I9kFQ?si=fxB5qfGHwVkwojJb))

## Story Description

Write a description of the story that your animation showcases. Give addional context for your story here in the case your animation is more abstract and only has images and little text. Lastly, include what data in your project is represented in 2D arrays and how those directly relate to the story your animation showcase.

My Personal Narrative Project highlights my experience living in Spain for a summer. This unforgettable experience broadened my perspectives allowing me to immerse myself in the rich culture, meet new people, and grow as a person. My program stores Strings/sentences and images as data and outputs them as visualizaion in the Theater class.
## Image Filter Analysis

Choose at least 2 filters uses in your animation to explain how the pixels are modified. If you created a new image filter that was not one of the ones from this unit, make sure to explain and analyze that filter(s) before choosing ones that came from this unit.

Random Color:
This method randomly modifies the color of an image by assigning a single randomly generated value (between 0 and 255) to either the red, green, or blue channel of each pixel. It first retrieves the pixel array of the image and then iterates through each pixel using nested loops. Based on the value generated, an if-else if-else structure determines which color channel (red, green, or blue) will be updated. If the value is greater than 175, the red channel is modified; if it is between 90 and 175, the blue channel is changed; otherwise, the green channel is adjusted. This process results in a randomized color effect applied across the entire image.

Sharpen:
This code modifies the pixels of an image by adjusting their color values based on the difference between each pixel and its top-left neighbor. By iterating through the image (excluding the border), it calculates the difference in red, green, and blue values between the current pixel and the neighboring pixel. It then averages these differences and applies them back to the current pixel while ensuring the new values remain within the valid range of 0 to 255. This process enhances local variations in color, which can be used for effects like edge enhancement or artistic filters.
