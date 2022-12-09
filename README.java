- 👋 Hi, I’m @Shoriful323
- 👀 I’m interested in ...
- 🌱 I’m currently learning ...
- 💞️ I’m looking to collaborate on ...
- 📫 How to reach me ...

<!---
Shoriful323/Shoriful323 is a ✨ special ✨ repository because its `README.md` (this file) appears on your GitHub profile.
You can click the Preview link to take a look at your changes.
--->
This script is for deleting your photos...
1. Go to your profile
2. Select Photos
3. Scroll down until you can see all the photos you wish to delete in this session (all of them if you like)
4. Paste this script in the console and press return
*/

function timeout(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}
(async () =>{
    while(document.querySelector(".fbTimelineSelectorButton")){
        var clickEvent = document.createEvent("MouseEvents");
        clickEvent.initEvent("click",true,false);
        document.querySelector(".fbTimelineSelectorButton").dispatchEvent(clickEvent);
        await timeout(500);
        document.querySelector("a.itemAnchor[data-action-type=delete_photo]").dispatchEvent(clickEvent);
        await timeout(1000);
        document.querySelector("button.layerConfirm").dispatchEvent(clickEvent);
        await timeout(3000);
    }
})()
