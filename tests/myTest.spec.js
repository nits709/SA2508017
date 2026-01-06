import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
  await page.goto('https://github.com/');
  await page.getByRole('link', { name: 'Sign in' }).click();
  await page.getByRole('textbox', { name: 'Username or email address' }).click();
  await page.getByRole('textbox', { name: 'Username or email address' }).click();
  await page.getByRole('textbox', { name: 'Username or email address' }).click();
  await page.getByRole('textbox', { name: 'Username or email address' }).fill('nitin');
  await page.goto('https://www.omayo.com/');
  await page.getByRole('textbox', { name: 'Name Message' }).click();
  await page.getByRole('textbox', { name: 'Name Message' }).fill('nitin');
  await page.getByRole('textbox', { name: 'Name Message' }).press('Tab');
  await page.getByRole('textbox', { name: 'Email' }).fill('gupta');
  await page.getByRole('textbox', { name: 'Email' }).press('Tab');
  await page.getByRole('textbox', { name: 'Phone' }).fill('234567898765432');
  await page.getByRole('checkbox', { name: 'I\'m not a robot' }).check();
  await page.getByRole('button', { name: '   Send' }).click();
  await page.getByText('Name').click();
});