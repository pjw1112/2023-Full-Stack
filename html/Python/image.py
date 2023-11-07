import pytesseract
import cv2 
import matplotlib.pyplot as plt
import os

current_directory = os.path.dirname(__file__)
file_name = "my.jpg"  # 실제 파일명으로 변경하세요
path = os.path.join(current_directory, file_name)


image = cv2.imread(path)

if image is None:
    print("이미지를 로드할 수 없습니다.")
else:
    # 이미지를 RGB로 변환
    rgb_image = cv2.cvtColor(image, cv2.COLOR_BGR2RGB)

    text = pytesseract.image_to_string(rgb_image, lang='kor+eng')
    print(text)
