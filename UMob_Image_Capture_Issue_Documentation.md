# UMob App Issue Assessment for Image Capture Crash
## 1. Gathering Information

- **Device Details:** What type of device (brand, model) is the user using?
- **Operating System:** Which version of the operating system is installed on the user's device?
- **App Version:** What is the version of the UMob app that the user is using?
- **Reproducibility:** Does the crash occur consistently every time the user tries to capture an image, or is it intermittent?
- **Error Messages:** Are there any error messages or codes displayed when the app crashes?
- **Steps to Reproduce:** Can the user provide a step-by-step process to reproduce the issue?
- **Network Conditions:** Is the user experiencing this issue under specific network conditions (e.g., poor connectivity)?
## 2. Assessing Urgency and Impact

- **Urgency:** Given that this issue prevents users from performing a crucial function (capturing proof of vehicle parking), it would be classified as High urgency.
- **Impact:** The impact is also High because it affects the core functionality of the app, potentially leading to user frustration and a negative user experience.
## 3. Investigating the Root Cause

- **Replicate the Issue:** Try to reproduce the problem on various devices and OS versions to identify if it's device-specific or widespread.
- **Check Logs:** Examine the application logs to see if there are any specific error messages or stack traces related to the crash.
- **Testing:** Perform rigorous testing, including unit tests and integration tests, focusing on the image capture functionality.
- **Collaborate with Developers:** Discuss findings with the development team to identify any known issues or fixes.
- **Deploy a Fix:** Once the root cause is identified, develop and deploy a fix as soon as possible, followed by thorough testing to ensure the issue is resolved.